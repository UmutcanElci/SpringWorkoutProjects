package kodlama.io.rentApp.core.utilities.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblamDetails {//Oluşacak hatalarda dönücek mesajları belirlemek için ayrı sınıflara ayrıp bunu kontrol altına ve düzene alıyoruz
    String message;//Eğer kontrol altına alınmassa son kullanıcıya istenmeyen mesajlar da giderbilir

}
