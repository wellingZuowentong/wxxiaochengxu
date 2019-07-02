package wx.wxceshi.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 作者：王怀朋
 * 日期：2019/7/2
 */
public class StringUtil {

    public static boolean judgeContainsStr(String str) {
        String regex=".*[a-zA-Z]+.*";
        Matcher m= Pattern.compile(regex).matcher(str);
        return m.matches();
    }

}
