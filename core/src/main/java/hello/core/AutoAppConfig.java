package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        어디서 찾을지 탐색위치를 지정한다. 아래는 디렉토리 위치
//        디폴트(지정안하면?)는 ComponentScan이 붙어있는 패키지의 위치 하위로 다 훑는다!
//        설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것이 좋다
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
