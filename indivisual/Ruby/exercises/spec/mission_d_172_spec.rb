require './app/mission_d_172.rb'

describe 'イヴの日付チェック' do
  describe '出力結果のテスト' do
    let(:missionD172) { MissionD172.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "25\n" }
      expect($stdout).to receive(:puts).with(24)
      missionD172.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "2\n" }
      expect($stdout).to receive(:puts).with(1)
      missionD172.run
    end
  end
end
