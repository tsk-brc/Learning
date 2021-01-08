require './app/mission_d_152.rb'

describe '文字列指定数以上存在チェック' do
  describe '出力結果のテスト' do
    let(:missionD152) { MissionD152.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "RRRWW\n", "3\n"
      expect($stdout).to receive(:puts).with('Yes')
      missionD152.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "RRWRW\n", "4\n"
      expect($stdout).to receive(:puts).with('No')
      missionD152.run
    end
  end
end
