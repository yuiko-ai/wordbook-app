# users(ユーザー)

ユーザーテーブル

## 概要
- アプリを利用するアカウントの情報を管理
- アカウント登録時にお名前、メールアドレス、パスワードを登録

## テーブル定義

| 論理名 | 物理名 | データ型 | 制約 | デフォルト値 | 備考 |
|--------------|----------------|--------|------|------------|------|
| ユーザーID | id | BIGSERIAL | PK | - | 自動採番 |
| ユーザー名 | name | VARCHAR(50) | NOT NULL | - | - |
| メールアドレス | email | VARCHAR(255) | NOT NULL, UNIQUE | ログインIDとして使用 |
| パスワード | password | VARCHAR(255) | NOT NULL | - | - |
| 作成日時 | created_at | TIMESTAMP | NOT NULL | CURRENT_TIMESTAMP | - |
| 更新日時 | updated_at | TIMESTAMP | NOT NULL | CURRENT_TIMESTAMP | 更新時に自動更新 |
| 削除日時 | deleted_at | TIMESTAMP | - | 論理削除用 |
