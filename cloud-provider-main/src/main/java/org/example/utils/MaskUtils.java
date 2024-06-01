package org.example.utils;

public class MaskUtils {

    public static final String SENSITIVEINFORMATION_HIDDENSTR = "*";

    private MaskUtils() {

    }

    /**
     * 用户名模糊化，个人姓名保留第1位，企业名保留前2后2
     *
     * @param debtor 用户名
     * @return 模糊化后的用户名
     */
    public static String maskDebtor(String debtor) {
        if (debtor == null || "".equals(debtor)) {
            return debtor;
        }
        if (debtor.length() > 4) {
            // 企业名
            return mask(debtor, 2, 2, SENSITIVEINFORMATION_HIDDENSTR);
        } else {
            // 个人姓名
            if (debtor.length() > 2) {
                return mask(debtor, 1, 1, SENSITIVEINFORMATION_HIDDENSTR);
            } else {
                return mask(debtor, 1, 0, SENSITIVEINFORMATION_HIDDENSTR);
            }
        }
    }

    /**
     * 手机号模糊化，保留前3后4
     *
     * @param mobile 手机号码
     * @return 模糊化后的手机号码
     */
    public static String maskMobile(String mobile) {
        if (mobile == null || "".equals(mobile)) {
            return mobile;
        }
        return mask(mobile, 3, 4, SENSITIVEINFORMATION_HIDDENSTR);
    }

    /**
     * 身份证号模糊化，保留前3
     *
     * @param idCard 身份证号
     * @return 模糊化后的身份证号
     */
    public static String maskIdCard(String idCard) {
        if (idCard == null || "".equals(idCard)) {
            return idCard;
        }
        return mask(idCard, 3, 0, SENSITIVEINFORMATION_HIDDENSTR);
    }

    /**
     * 企业注册号模糊化，保留前3后3
     *
     * @param companyCode 企业注册号
     * @return 模糊化后的身份证号
     */
    public static String maskCompanyCode(String companyCode) {
        if (companyCode == null || "".equals(companyCode)) {
            return companyCode;
        }
        return mask(companyCode, 3, 4, SENSITIVEINFORMATION_HIDDENSTR);
    }

    /**
     * 模糊化银行卡号，只保留显示后四位
     *
     * @param bankCardNo
     * @return
     */
    public static String maskBankCardNo(String bankCardNo) {
        if (bankCardNo == null || "".equals(bankCardNo)) {
            return bankCardNo;
        }
        return mask(bankCardNo, 0, 4, SENSITIVEINFORMATION_HIDDENSTR);
    }

    /**
     * 模糊化姓名只保留显示一位
     *
     * @param debtor
     * @return
     */
    public static String maskDebtorExceptFirst(String debtor) {
        if (debtor == null || "".equals(debtor)) {
            return debtor;
        }
        if (debtor.length() > 4) {
            // 企业名
            return mask(debtor, 2, 2, SENSITIVEINFORMATION_HIDDENSTR);
        } else {
            // 个人姓名
            return mask(debtor, 1, 0, SENSITIVEINFORMATION_HIDDENSTR);
        }
    }


    public static String maskEmail(String email) {
        if (email == null || email.equals("")) return email;
        return mask(email, '@', false, SENSITIVEINFORMATION_HIDDENSTR);
    }

    /**
     * 敏感信息模糊化，将源字符串中指定位置的字符进行替换，模糊化前后字符串长度保持不变
     *
     * @param source        需要处理的源字符串
     * @param startDigit    从字符串开始保留的位数
     * @param backwardDigit 倒数保留的位数
     * @param hiddenStr
     * @return
     */
    public static String mask(String source, int startDigit, int backwardDigit, String hiddenStr) {

        if (source == null || (source.length() < (startDigit + backwardDigit))) {
            return source;
        }
        StringBuilder result = new StringBuilder(source.length());
        char[] chars = source.toCharArray();
        for (int i = 0; i < source.length(); i++) {
            if (i < startDigit) {
                result.append(chars[i]);
            } else if (i >= (chars.length - backwardDigit)) {
                result.append(chars[i]);
            } else {
                result.append(hiddenStr);
            }
        }
        return result.toString();
    }

    /**
     *
     * @param source 源字符串
     * @param maskFlag 掩蔽标识
     * @param masDirection 掩蔽方向，true为向后掩蔽
     * @param hiddenStr 替换字符
     * */
    public static String mask(String source, char maskFlag, boolean masDirection, String hiddenStr) {
        if (source == null) return null;
        int flagIndex = source.indexOf(maskFlag);
        if (flagIndex == -1) return source;
        if (masDirection) {
            return mask(source, flagIndex + 1, 0, hiddenStr);
        } else {
            return mask(source, 0, source.length() - flagIndex, hiddenStr);
        }
    }
}
