namespace :db do
  desc 'Rebuild the development database from scratch'
  task :rebuild => :environment do
    sh 'rm -f db/development.mysql'
    Rake::Task['db:migrate'].invoke
    Rake::Task['db:seed'].invoke
  end
end
