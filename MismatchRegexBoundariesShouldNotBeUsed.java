package javacodechecker;

 

import java.util.regex.Pattern;

public class MismatchRegexBoundariesShouldNotBeUsed{
    // EMB-ISSUE: CodeIssueNames.MISMATCH_REGEX_BOUNDARIES_SHOULD_NOT_BE_USED
    pattern pattern = Pattern.compile("$[a-z]+^");
    Matcher matcher = pattern.matcher("");
    }
