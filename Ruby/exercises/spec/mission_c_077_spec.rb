require './app/mission_c_077.rb'

describe 'レポート評価チェック' do
  describe '出力結果のテスト' do
    let(:missionC077) { MissionC077.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3 25\n",
      "-2 17\n",
      "-7 20\n",
      "2 24\n"
      expect($stdout).to receive(:puts).with('C')
      expect($stdout).to receive(:puts).with('A')
      expect($stdout).to receive(:puts).with('B')
      missionC077.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1 50\n", "10 49\n"
      expect($stdout).to receive(:puts).with('D')
      missionC077.run
    end
  end
end
