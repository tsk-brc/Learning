require './app/mission_d_159.rb'

describe '最大文字数チェック' do
  describe '出力結果のテスト' do
    let(:missionD159) { MissionD159.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "engineer\n",
      "coding\n",
      "programming\n"
      expect($stdout).to receive(:puts).with(11)
      missionD159.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "abc\n", "def\n", "ghi\n"
      expect($stdout).to receive(:puts).with(3)
      missionD159.run
    end
  end
end
