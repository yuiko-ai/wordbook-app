package j.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import j.entity.Word;
import j.service.WordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

@RequestMapping("/words")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class WordController {
    private final WordService wordService;

    // 一覧取得
    @GetMapping
    public List<Word> getAllWords() {
        return wordService.getAllWords();
    }

    // 保存
    @PostMapping
    public Word createWord(@RequestBody Word word) {
        return wordService.saveWord(word);
    }

    // 一件取得
    @GetMapping("/{id}")
    public Word getWordById(@PathVariable Long id) {
        return wordService.getWordById(id);
    }

    // 削除
    @DeleteMapping("/{id}")
    public void deleteWord(@PathVariable Long id) {
        wordService.deleteWord(id);
    }
}
