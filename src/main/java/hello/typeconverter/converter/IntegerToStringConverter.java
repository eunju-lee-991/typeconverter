package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.bind.annotation.ModelAttribute;

@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String> {

    @Override
    public String convert(@ModelAttribute  Integer source) {
        log.info("converter source = {}", source);
        return String.valueOf(source);
    }


}
