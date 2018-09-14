package muic.backend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class WebConfiguration {

    @Bean
    public InternalResourceViewResolver viewResolver () {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
