package hexlet.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Url {
    private int id;
    private String name;
    private Date createdAt;
}
