require './app/mission_d_141.rb'

describe '文字列結合チェック' do
  describe '出力結果のテスト' do
    let(:missionD141) { MissionD141.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n",
      "taro\n",
      "jiro\n",
      "saburo\n"
      expect($stdout).to receive(:puts).with('taro jiro saburo')
      missionD141.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "5\n",
      "aaa\n",
      "bbb\n",
      "ccc\n",
      "ddd\n",
      "eee\n"
      expect($stdout).to receive(:puts).with('aaa bbb ccc ddd eee')
      missionD141.run
    end
  end
end
