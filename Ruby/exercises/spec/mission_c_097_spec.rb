require './app/mission_c_097.rb'

describe '当選チェック' do
  describe '出力結果のテスト' do
    let(:missionC097) { MissionC097.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5 2 4\n"
      expect($stdout).to receive(:puts).with('N')
      expect($stdout).to receive(:puts).with('A')
      expect($stdout).to receive(:puts).with('N')
      expect($stdout).to receive(:puts).with('AB')
      expect($stdout).to receive(:puts).with('N')
      missionC097.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "6 3 2\n"
      expect($stdout).to receive(:puts).with('N')
      expect($stdout).to receive(:puts).with('B')
      expect($stdout).to receive(:puts).with('A')
      expect($stdout).to receive(:puts).with('B')
      expect($stdout).to receive(:puts).with('N')
      expect($stdout).to receive(:puts).with('AB')
      missionC097.run
    end
  end
end
