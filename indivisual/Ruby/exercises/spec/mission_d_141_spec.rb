require './app/mission_d_141.rb'

describe 'ペアチェック' do
  describe '出力結果のテスト' do
    let(:missionD141) { MissionD141.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "3\n",
      "taro\n",
      "jiro\n",
      "saburo\n"
      expect(STDOUT).to receive(:puts).with('taro jiro saburo')
      missionD141.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "5\n",
      "aaa\n",
      "bbb\n",
      "ccc\n",
      "ddd\n",
      "eee\n"
      expect(STDOUT).to receive(:puts).with('aaa bbb ccc ddd eee')
      missionD141.run
    end
  end
end
