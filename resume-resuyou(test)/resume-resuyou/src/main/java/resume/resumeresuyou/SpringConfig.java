package resume.resumeresuyou;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import resume.resumeresuyou.repository.MemoryResumeRepository;
import resume.resumeresuyou.repository.ResumeRepository;
import resume.resumeresuyou.service.ResumeService;

@Configuration
public class SpringConfig {

    @Bean
    public ResumeService resumeService() {
        return new ResumeService(resumeRepository());
    }

    @Bean
    public ResumeRepository resumeRepository() {
        return new MemoryResumeRepository();
    }
}
