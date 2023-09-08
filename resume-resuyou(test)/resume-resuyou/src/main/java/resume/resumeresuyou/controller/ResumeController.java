 package resume.resumeresuyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import resume.resumeresuyou.domain.Resume;
import resume.resumeresuyou.service.ResumeService;

import java.util.List;

@Controller
public class ResumeController {

    private final ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping("/resume/new")   //url 명칭
    public String createResumeForm() {
        return "resume/createResumeForm";
    }   //html 위치

    @PostMapping("/resume/new")
    public String create(ResumeForm form) {
        Resume resume = new Resume();
        resume.setResume(form.getResume());

        resumeService.register(resume);

        return "redirect:/";
    }

    @GetMapping("/resume")
    public String list(Model model) {
        List<Resume> resumes = resumeService.findAllResume();
        model.addAttribute("resumes", resumes);
        return "resume/resumeList";
    }
}
