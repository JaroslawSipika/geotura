package com.example.geotura;

import com.example.geotura.rest.DTO.LocalDateFormatter;
import com.example.geotura.rest.DTO.LocalDateTimeFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableJpaRepositories
@SpringBootApplication
public class GeoturaApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(GeoturaApplication.class, args);
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new LocalDateFormatter());
		registry.addFormatter(new LocalDateTimeFormatter());
	}


//	@Bean
//	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder().serializers(LOCAL_DATETIME_SERIALIZER)
//				.serializationInclusion(JsonInclude.Include.NON_NULL);
//		return new MappingJackson2HttpMessageConverter(builder.build());
//	}
//	@Bean
//	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
//
//
//
//		jsonConverter.setObjectMapper(objectMapper);
//		return jsonConverter;
//	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
			}
		};
	}



}
