package jmxjava.base.string;

public class SubAc {
    public static void main(String[] args) {

        String pkgName = "";
        String className = "";
        String mFocusedActivity = "mFocusedActivity: ActivityRecord{f70e135 u0 com.zncm.dminter.mmhelper/.SettingNew t15741}";
        if (mFocusedActivity.contains("mFocusedActivity")) {
            mFocusedActivity = mFocusedActivity.substring(mFocusedActivity.indexOf("{") + 1, mFocusedActivity.indexOf("}"));
            System.out.println(mFocusedActivity);
            /**
             *f70e135 u0 com.zncm.dminter.mmhelper/.SettingNew t15741
             */
            if (mFocusedActivity.contains(" ")) {
                String arr[] = mFocusedActivity.split(" ");
                for (String tmp : arr
                        ) {
                    System.out.println(tmp);
                }
                if (arr != null && arr.length > 0 && arr.length == 4) {
                    mFocusedActivity = arr[2];
                    System.out.println(mFocusedActivity);

                    if (mFocusedActivity.contains("/")) {
                        arr = mFocusedActivity.split("/");

                        if (arr != null && arr.length > 0 && arr.length == 2) {
                            pkgName = arr[0];
                            className = arr[1];
                            System.out.println(pkgName + " " + pkgName + className);
                        }
                    }
                }
            }
        }
    }
}
