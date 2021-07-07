import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MismatchRegexBoundariesShouldNotBeUsed{
    // EMB-ISSUE: CodeIssueNames.MISMATCH_REGEX_BOUNDARIES_SHOULD_NOT_BE_USED
    Pattern pattern = Pattern.compile("$[a-z]+^");
    Matcher matcher = pattern.matcher("");
    }
