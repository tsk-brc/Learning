require './app/mission_c_082.rb'

describe '赤点数のチェック' do
  describe '出力結果のテスト' do
    let(:missionC082) { MissionC082.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "4 2\n",
      "80 60 40\n",
      "50 50 40\n",
      "80 50 40\n",
      "40 80 80\n"
      expect($stdout).to receive(:puts).with(1)
      expect($stdout).to receive(:puts).with(3)
      expect($stdout).to receive(:puts).with(2)
      expect($stdout).to receive(:puts).with(1)
      missionC082.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3 1\n",
      "100 50 50\n",
      "100 50 50\n",
      "100 50 50\n"
      expect($stdout).to receive(:puts).with(3)
      expect($stdout).to receive(:puts).with(3)
      expect($stdout).to receive(:puts).with(3)
      missionC082.run
    end
  end
end
