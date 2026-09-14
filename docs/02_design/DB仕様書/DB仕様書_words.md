# words(単語)

単語テーブル

## 概要
- ユーザーが登録した単語の情報を管理する。

## テーブル定義

| 論理名 | 物理名 | データ型 | 制約 | デフォルト値 | 備考 |
|--------------|----------------|--------|------|------------|------|
| 単語ID | id | BIGSERIAL | PK | - | 自動採番 |
| ユーザーID | user_id | BIGINT | FK, NOT NULL | - | 登録したユーザーのID |
| 単語 | term | VARCHAR(100) | NOT NULL | - | 単語 |
| 意味 | meaning | TEXT | NOT NULL | - | 単語の意味 |
| 例文・利用シーン | example | - | NULL | - |
| 参考URL | url | VARCHAR(100) | - | NULL | - |
| セクション | section_id | BIGINT | FK | - | セクションID、未分類はNULLを許容|
| 重要度 | importance | INT | - | NULL | 1 ~ 5で入力する | 
| 閲覧回数 | view_count | INT | NOT NULL | 0 | 詳細画面を表示した回数
| 作成日時 | created_at | TIMESTAMP | NOT NULL | CURRENT_TIMESTAMP | - |
| 更新日時 | updated_at | TIMESTAMP | - | CURRENT_TIMESTAMP | 更新時に自動更新 |

## リレーション
| リレーション種別 | 対象テーブル | 対象カラム | 備考 (条件など) |
| :--- | :--- | :--- | :--- |
| **Belongs To** (多対1) | `users` | `id` | どのユーザーが登録した単語か( `user_id` で紐付け) |
| **Belongs To** (多対1) | `sections` | `id` | どのセクションに属しているか(`section_id`で紐付け) |
| **Hos Many** (1対多) | `word_tags` | `word_id` | 単語に付与されたタグの中間テーブル |