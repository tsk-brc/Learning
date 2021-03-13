require './app/mission_d_177.rb'

describe '通信料金チェック' do
  describe '出力結果のテスト' do
    let(:missionD177) { MissionD177.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "720 3\n" }
      expect($stdout).to receive(:puts).with(2160)
      missionD177.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "1980 7\n" }
      expect($stdout).to receive(:puts).with(13860)
      missionD177.run
    end
  end
end
