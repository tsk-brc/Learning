#使用するDockerイメージ
FROM mysql:5.7

#MySQL設定ファイルをイメージ内にコピー
ADD my.cnf /etc/mysql/conf.d/my.cnf

#docker run時に実行
CMD ["mysqld"]