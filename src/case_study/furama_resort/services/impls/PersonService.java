package case_study.furama_resort.services.impls;

import case_study.furama_resort.models.Person;
import case_study.furama_resort.utils.get_info.GetInFo;

public class PersonService {
    /**
     * Hàm lấy tên người
     * Định dạng: Không chứa số và kí tự đặc biệt
     * Các từ cách nhau bởi 1 dấu cách
     * Kí tự đầu và cuối không được là dấu cách
     *
     * @return Tên - String
     */
    public static String getNameInfo() {
        final String NAME_REGEX = "^\\p{L}+(\\s\\p{L}+)*$";
        return GetInFo.getStringInfo("Name: ", NAME_REGEX,
                "The name cannot contain numbers and special characters.",
                5, 10,
                "Length of name must be from 5 to 50 characters long");
    }

    /**
     * Hàm lấy email
     * Định dạng: Phần tên: ký tự chữ hoặc số + @
     * Phần mở rộng: Ký tự chữ hoặc số, có thể ngăn cách bằng 1 dấu .
     * Dấu . không nằm sau cùng
     * Kí tự đầu và cuối không được là dấu cách
     *
     * @return email - String
     */
    public static String getEmailInfo() {
        final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return GetInFo.getStringInfo("Email: ", EMAIL_REGEX,
                "Name: character or number +@+ Tail: character or number or 1 sign.\n" +
                        "Sign . not at the end.");
    }

    /**
     * Hàm lấy số điện thoại
     * Định dạng: xx-0xxxxxxxxx
     * Trong đó X là kí tự số. (sau - có 9 chữ số)
     *
     * @return email - String
     */
    public static String getPhoneNumberInfo() {
        final String PHONE_NUMBER_REGEX = "^\\d{2}[-]0\\d{9}$";
        return GetInFo.getStringInfo("Phone Number: ", PHONE_NUMBER_REGEX,
                "Phone number format must be: xx-0xxxxxxxxx");
    }

    /**
     * Hàm lấy giới tính. Cho người dùng chọn giới tính trong mảng.
     *
     * @return giới tính String
     */
    public static String getGenderInfo() {
        int choice = GetInFo.takeChoice("Gender: ", Person.GENDER_OPTIONS);
        return Person.GENDER_OPTIONS[choice - 1];
    }

    /**
     * Hàm lấy CMND dạng String.
     * Định dạng: 9 chữ số.
     * Số đầu tiên khác 0.
     *
     * @return giới tính String
     */
    public static String getIdentityCardInfo() {
        final String IDENTITY_CARD_REGEX = "^[1-9][0-9]{8}$";
        return GetInFo.getStringInfo("IdentityCard: ", IDENTITY_CARD_REGEX,
                "Identity Card number must be consists of 9 numbers, the first number is different from 0");
    }

    /**
     * @return
     */
    public static String getAddressInfo() {
        final String ADDRESS_REGEX = "^(\\p{L}+(\\s\\p{L}+)*)\\s\\-\\s(\\p{L}+(\\s\\p{L}+)*)$";
        return GetInFo.getStringInfo("Address: ", ADDRESS_REGEX,
                "Address in the format District Name - Province Name");
    }
}
