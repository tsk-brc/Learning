require './app/mission_c_085.rb'

describe 'キー入力のチェック' do
  describe '出力結果のテスト' do
    let(:missionC085) { MissionC085.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "1 3 2 6 3 5 5 6 2 6 0 4 5 2 4 2 1 2 4 0 4 2 2 5 0 2\n", "abcabcabcabc\n"
      expect(STDOUT).to receive(:puts).with('abcbcb')
      missionC085.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "1 10 10 1 10 10 10 10 10 10 10 10 10 10 10 10 10 10 1 10 10 10 1 10 10 10\n", "wwwssssdadawsddwsdaw\n"
      expect(STDOUT).to receive(:puts).with('wsda')
      missionC085.run
    end
  end
end
