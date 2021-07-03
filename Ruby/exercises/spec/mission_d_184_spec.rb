require './app/mission_d_184.rb'

describe '時給計算チェック' do
  describe '出力結果のテスト' do
    let(:missionD184) { MissionD184.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "7\n", "program\n"
      expect($stdout).to receive(:puts).with('p')
      expect($stdout).to receive(:puts).with('r')
      expect($stdout).to receive(:puts).with('o')
      expect($stdout).to receive(:puts).with('g')
      expect($stdout).to receive(:puts).with('r')
      expect($stdout).to receive(:puts).with('a')
      expect($stdout).to receive(:puts).with('m')
      missionD184.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1\n", "a\n"
      expect($stdout).to receive(:puts).with('a')
      missionD184.run
    end
  end
end
