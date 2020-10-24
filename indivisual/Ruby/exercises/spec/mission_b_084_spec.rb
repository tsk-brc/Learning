require './app/mission_b_084.rb'

describe '行きたい店舗チェック' do
  describe '出力結果のテスト' do

    let(:missionB084) { MissionB084.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "4 3 2\n", "3 0 3 0\n", "3 3 3 1\n", "1 3 1 3\n", "3 0 3 3\n"
      expect(STDOUT).to receive(:puts).with('2 4')
      missionB084.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "5 3 2\n", "1 3 0 3 2\n", "1 0 1 0 1\n", "3 0 2 0 1\n", "3 0 3 0 3\n"
      expect(STDOUT).to receive(:puts).with('no')
      missionB084.run
    end
  end
end