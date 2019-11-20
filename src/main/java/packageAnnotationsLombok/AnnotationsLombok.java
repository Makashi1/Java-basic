package packageAnnotationsLombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@ToString dodaje metode toString ()
//@Setter dodaje settery dla wszystkich pól
//@NoArgsConstructor dodaje konstruktor domyślny dla wszystkich pól
@AllArgsConstructor  //dodaje konstruktor z wszystkimi polami klasowymi w argumencie
@Data  // dodaje  gettery, settery i toString() do wszystkich pól klasowych
public class AnnotationsLombok {
    private String login;
    private String password;
    private String ksywa;


    public AnnotationsLombok() {

    }
}
