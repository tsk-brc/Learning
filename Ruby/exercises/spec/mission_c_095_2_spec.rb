require './app/mission_c_095_2.rb'

describe 'バス到着時刻チェック' do
  describe '出力結果のテスト' do
    let(:missionC095) { MissionC095_2.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5 5\n", "2\n", "1\n", "7\n", "3\n", "10\n"
      expect($stdout).to receive(:puts).with(3)
      expect($stdout).to receive(:puts).with(7)
      missionC095.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "2 3\n", "3\n", "1\n"
      expect($stdout).to receive(:puts).with(3)
      missionC095.run
    end
  end
end
