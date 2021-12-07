package Task5.Trip;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pasenger {
    private String name;
    private boolean haveTicket;

    public String getName() {
        return name;
    }

    public boolean isHaveTicket() {
        return haveTicket;
    }
}
