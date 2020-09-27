require './app/mission_d_163.rb'

describe '文字列縦書き出力チェック' do
  describe '出力結果のテスト' do

    let(:missionD163) { MissionD163.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "Pizza\n" }
      expect(STDOUT).to receive(:puts).with('P')
      expect(STDOUT).to receive(:puts).with('i')
      expect(STDOUT).to receive(:puts).with('z')
      expect(STDOUT).to receive(:puts).with('z')
      expect(STDOUT).to receive(:puts).with('a')
      missionD163.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "ABC\n" }
      expect(STDOUT).to receive(:puts).with('A')
      expect(STDOUT).to receive(:puts).with('B')
      expect(STDOUT).to receive(:puts).with('C')
      missionD163.run
    end
  end
end