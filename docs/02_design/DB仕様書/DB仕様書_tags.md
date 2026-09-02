# tags(タグ)

タグテーブル

## 概要
- 単語に付与するタグ情報を管理する。

## テーブル定義

| 論理名 | 物理名 | データ型 | 制約 | デフォルト値 | 備考 |
|--------------|----------------|--------|------|------------|------|
| タグID | id | BIGSERIAL | PK | - | 自動採番 |
| ユーザーID | user_id | BIGINT | FK, NOT NULL | - | 登録したユーザーのID |
| タグ名 | name | VARCHAR(50) | NOT NULL | - | 例: 「デプロイ」「AWS」 |
| 作成日時 | created_at | TIMESTAMP | NOT NULL | CURRENT_TIMESTAMP | - |
| 更新日時 | updated_at | TIMESTAMP | NOT NULL | CURRENT_TIMESTAMP | 更新時に自動更新 |
| 削除日時 | deleted_at | TIMESTAMP | - | NULL | 論理削除用 |

## リレーション
| リレーション種別 | 対象テーブル | 対象カラム | 備考 (条件など) |
| :--- | :--- | :--- | :--- |
| **Belongs To** (多対1) | `users` | `id` | どのユーザーが作成したタグか（`user_id` で紐付け） |
| **Has Many** (1対多) | `word_tags` | `tag_id` | 単語に付与されたタグの中間テーブル |