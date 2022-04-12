package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.web.bind.annotation.ModelAttribute;

@Getter
@EqualsAndHashCode // equals로 비교할 때 참조값이 달라도 데이터가 같으면 true로 나오게 해준다. 롬복 안 쓰면 직접 구현해야함
public class IpPort {
    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
