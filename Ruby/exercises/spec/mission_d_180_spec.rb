require './app/mission_d_180.rb'

describe 'うなりチェック' do
  describe '出力結果のテスト' do
    let(:missionD180) { MissionD180.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "440 445\n" }
      expect($stdout).to receive(:puts).with(5)
      missionD180.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "440 430\n" }
      expect($stdout).to receive(:puts).with(10)
      missionD180.run
    end
  end
end
