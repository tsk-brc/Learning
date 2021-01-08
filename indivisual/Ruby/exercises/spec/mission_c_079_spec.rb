require './app/mission_c_079.rb'

describe 'カードコンプリートのチェック' do
  describe '出力結果のテスト' do
    let(:missionC079) { MissionC079.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "6 3\n",
      "1\n",
      "2\n",
      "2\n",
      "3\n",
      "1\n",
      "3\n"
      expect($stdout).to receive(:puts).with(4)
      missionC079.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "7 4\n",
      "1\n",
      "2\n",
      "3\n",
      "1\n",
      "2\n",
      "3\n",
      "1\n"
      expect($stdout).to receive(:puts).with('unlucky')
      missionC079.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets).and_return "1 100\n", "1\n"
      expect($stdout).to receive(:puts).with('unlucky')
      missionC079.run
    end
  end
end
