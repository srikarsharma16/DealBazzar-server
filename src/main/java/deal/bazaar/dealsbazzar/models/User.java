package deal.bazaar.dealsbazzar.models;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

@Document("user")
public class User {

  @Id
  private String Id;
  private String name;
  private String email;
  private String password;
  private long phone;
  private String address;
// @JsonFormat(pattern = "yyyy-MM-dd")
  private String dob;
 // private Boolean isActive;

}
