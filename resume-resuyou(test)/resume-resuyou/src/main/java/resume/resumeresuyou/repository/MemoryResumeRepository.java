package resume.resumeresuyou.repository;

import resume.resumeresuyou.domain.Resume;

import java.util.*;

public class MemoryResumeRepository implements ResumeRepository{

    private static Map<Long, Resume> store = new HashMap<>();     //store에 들어온 새로운 정보 다 저장함
    private static long sequence = 0L;

    @Override
    public Resume save(Resume resume) {
        resume.setId(++sequence);
        store.put(resume.getId(), resume);
        return resume;
    }

    @Override
    public Optional<Resume> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Resume> findByResume(String newresume) {
        return store.values().stream()
                .filter(resume -> resume.getResume().equals(newresume))
                .findAny();
    }

    @Override
    public List<Resume> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
