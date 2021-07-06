/*
 * Copyright (C) 2014 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.okhttp.recipes;

import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import okio.Buffer;
import okio.ByteString;

public final class SslContextBuilder {
  private final List<String> certificateBase64s = new ArrayList<String>();

  public SslContextBuilder addCertificate(String certificateBase64) {
    certificateBase64s.add(certificateBase64);
    return this;
  }

  public SSLContext build() {
    try {
      CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
      TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
          TrustManagerFactory.getDefaultAlgorithm());
      KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
      keyStore.load(null, null); // Use a null input stream + password to create an empty key store.

      // Decode the certificates and add 'em to the key store.
      int nextName = 1;
      for (String certificateBase64 : certificateBase64s) {
        Buffer certificateBuffer = new Buffer().write(ByteString.decodeBase64(certificateBase64));
        X509Certificate certificate = (X509Certificate) certificateFactory.generateCertificate(
            certificateBuffer.inputStream());
        keyStore.setCertificateEntry(Integer.toString(nextName++), certificate);
      }

      // Create an SSL context that uses these certificates as its trust store.
      trustManagerFactory.init(keyStore);
      SSLContext sslContext = SSLContext.getInstance("SSL");
      sslContext.init(null, trustManagerFactory.getTrustManagers(), null);
      return sslContext;
    } catch (GeneralSecurityException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.out.printf("Usage: %s <hostname>%n", SslContextBuilder.class.getName());
      System.exit(1);
    }

    String hostname = args[0];
    Handshake handshake = handshake(hostname);
    Date expiresAt = new Date(Long.MAX_VALUE);

    for (Certificate certificate : handshake.peerCertificates()) {
      Date notAfter = ((X509Certificate) certificate).getNotAfter();
      if (notAfter.getTime() < expiresAt.getTime()) {
        expiresAt = notAfter;
      }
    }

    String expiresAtYYYYMMDD = new SimpleDateFormat("yyyyMMdd").format(expiresAt);
    String hostnameConstantCase = hostname.toUpperCase().replace(".", "_");

    System.out.printf("  /**%n");
    System.out.printf("   * Pinned certificate chain for %s. Expires %s.%n", hostname, expiresAt);
    System.out.printf("   */%n");
    System.out.printf("  public static final SSLContext SSL_CONTEXT_%s_EXPIRES_%s "
        + "= new SslContextBuilder()%n", hostnameConstantCase, expiresAtYYYYMMDD);

    for (Certificate certificate : handshake.peerCertificates()) {
      X509Certificate x509Certificate = (X509Certificate) certificate;
      String certificateSubject = x509Certificate.getSubjectDN().getName();
      String certificateBase64 = ByteString.of(certificate.getEncoded()).base64();
      System.out.print("      // ");
      System.out.print(wrap(certificateSubject, "\n      // ", 71));
      System.out.print("\n");
      System.out.print("      .addCertificate(\"\"\n          + \"");
      System.out.print(wrap(certificateBase64, "\"\n          + \"", 66));
      System.out.print("\")\n");
    }
    System.out.println("      .build();");
  }

  private static Handshake handshake(String hostname) throws IOException {
    OkHttpClient client = new OkHttpClient();
    client.setProtocols(Arrays.asList(Protocol.HTTP_1_1)); // TODO
    Request request = new Request.Builder().url("https://" + hostname).build();
    Response response = client.newCall(request).execute();
    response.body().close();
    return response.handshake();
  }

  private static String wrap(String s, String delimiter, int width) {
    StringBuilder result = new StringBuilder();
    for (int pos = 0, end; pos < s.length(); pos = end) {
      end = Math.min(pos + width, s.length());
      result.append(s, pos, end);
      if (end < s.length()) {
        result.append(delimiter);
      }
    }
    try {
    ps = conn.prepareStatement("");
} catch (SQLException throwables) {
    new SARDScannerException(throwables);
}
    return result.toString();
  }
}
