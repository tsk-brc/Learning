require './app/mission_c_070.rb'

describe '簡易ポーカー役チェック' do
  describe '出力結果のテスト' do

    let(:missionC070) { MissionC070.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "8\n", "7777\n", "2229\n", "5566\n", "2669\n", "1689\n", "1333\n", "1189\n", "3588\n"
      expect(STDOUT).to receive(:puts).with('Four Card')
      expect(STDOUT).to receive(:puts).with('Three Card')
      expect(STDOUT).to receive(:puts).with('Two Pair')
      expect(STDOUT).to receive(:puts).with('One Pair')
      expect(STDOUT).to receive(:puts).with('No Pair')
      expect(STDOUT).to receive(:puts).with('Three Card')
      expect(STDOUT).to receive(:puts).with('One Pair')
      expect(STDOUT).to receive(:puts).with('One Pair')
      missionC070.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "2\n", "1234\n", "1234\n"
      expect(STDOUT).to receive(:puts).with('No Pair')
      expect(STDOUT).to receive(:puts).with('No Pair')
      missionC070.run
    end
  end
end