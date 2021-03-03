require './app/mission_d_167.rb'

describe '金額算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD167) { MissionD167.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "1000\n" }
      expect($stdout).to receive(:puts).with(1003)
      missionD167.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "999\n" }
      expect($stdout).to receive(:puts).with(999)
      missionD167.run
    end
  end
end
