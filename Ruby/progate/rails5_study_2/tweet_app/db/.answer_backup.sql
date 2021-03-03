PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE "schema_migrations" ("version" varchar NOT NULL PRIMARY KEY);
INSERT INTO "schema_migrations" VALUES('20170215053008');
CREATE TABLE "ar_internal_metadata" ("key" varchar NOT NULL PRIMARY KEY, "value" varchar, "created_at" datetime NOT NULL, "updated_at" datetime NOT NULL);
INSERT INTO "ar_internal_metadata" VALUES('environment','development','2017-03-15 05:46:29.611676','2017-03-15 05:46:29.611676');
CREATE TABLE "posts" ("id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "content" text, "created_at" datetime NOT NULL, "updated_at" datetime NOT NULL);
INSERT INTO "posts" VALUES(1,'今日からProgateでRailsの勉強するよー！','2017-03-15 05:54:03.539962','2017-03-15 05:54:03.539962');
INSERT INTO "posts" VALUES(2,'投稿一覧ページ作成中！','2017-03-15 05:54:35.782479','2017-03-15 05:54:35.782479');
INSERT INTO "posts" VALUES(3,'やっぱりプログラミングは楽しい！','2017-03-15 05:54:35.782479','2017-03-15 05:54:35.782479');
DELETE FROM sqlite_sequence;
INSERT INTO "sqlite_sequence" VALUES('posts',3);
COMMIT;

