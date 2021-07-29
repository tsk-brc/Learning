require './app/mission_d_187.rb'

describe '曲名/歌手チェック' do
  describe '出力結果のテスト' do
    let(:missionD187) { MissionD187.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "ABCDEFG\n", "abcdefg\n"
      expect($stdout).to receive(:puts).with('ABCDEFG/abcdefg')
      missionD187.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "Champion\n", "Alice\n"
      expect($stdout).to receive(:puts).with('Champion/Alice')
      missionD187.run
    end
  end
end
