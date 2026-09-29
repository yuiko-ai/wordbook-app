package j.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import j.entity.Word;
import j.repository.WordRepository;

@Service
@RequiredArgsConstructor
public class WordService {
    private final WordRepository wordRepository;

    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }

    public Word saveWord(Word word) {
        return wordRepository.save(word);
    }

    public Word getWordById(Long id) {
        return wordRepository.findById(id).orElse(null);
    }

    public void deleteWord(Long id) {
        wordRepository.deleteById(id);
    }
}
