# sections(ユーザー)

セクションテーブル

## 概要
- 単語を大枠で分類するためのセクション情報を管理する

## テーブル定義

| 論理名 | 物理名 | データ型 | 制約 | デフォルト値 | 備考 |
|--------------|----------------|--------|------|------------|------|
| セクションID | id | BIGSERIAL | PK | - | 自動採番 |
| ユーザーID | user_id | BIGINT | FK, NOT NULL | - | 登録したユーザーのID |
| セクション名 | name | VARCHAR(50) | NOT NULL | - | 例: 「Web標準」「DB設計」 |
| カラーコード | color_code | VARCHAR(7) | - | NULL | 画面表示用の色コード |
| 作成日時 | created_at | TIMESTAMP | NOT NULL | CURRENT_TIMESTAMP | - |
| 更新日時 | updated_at | TIMESTAMP | NOT NULL | CURRENT_TIMESTAMP | 更新時に自動更新 |
| 削除日時 | deleted_at | TIMESTAMP | - | NULL | 論理削除用 |

## リレーション
| リレーション種別 | 対象テーブル | 対象カラム | 備考 (条件など) |
| :--- | :--- | :--- | :--- |
| **Hos Many** (1対多) | `words` | `section_id` | どのセクションに属しているか(`id`)で紐付け |
| **Belongs To** (多対1) | `users` | `id` | どのユーザーが登録した単語か( `user_id` で紐付け) |