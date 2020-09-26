require './app/mission_c_084.rb'

describe '装飾文字列のチェック' do
  describe '出力結果のテスト' do

    let(:missionC084) { MissionC084.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets) { "Test\n" }
      expect(STDOUT).to receive(:puts).with('++++++')
      expect(STDOUT).to receive(:puts).with('+Test+')
      expect(STDOUT).to receive(:puts).with('++++++')
      missionC084.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets) { "TicTacToe\n" }
      expect(STDOUT).to receive(:puts).with('+++++++++++')
      expect(STDOUT).to receive(:puts).with('+TicTacToe+')
      expect(STDOUT).to receive(:puts).with('+++++++++++')
      missionC084.run
    end
  end
end