import java.time.LocalDate;
import java.time.Month;

public interface Personable {

    void favoriteSport();

    String favoriteLanguage();

    Month favoriteMouth();

    String getLastName(String surname);

    LocalDate getDateOfBrith();

    String getPhoneNumberAndEmail(String email);

    long[] getPeopleOfAllAges(byte[] ages);

}