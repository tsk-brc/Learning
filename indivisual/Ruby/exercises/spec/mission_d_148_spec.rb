require './app/mission_d_148.rb'

describe '試験点チェック' do
  describe '出力結果のテスト' do
    let(:missionD148) { MissionD148.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "50 60\n", "51\n"
      expect(STDOUT).to receive(:puts).with(50)
      missionD148.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "50 60\n", "30\n"
      expect(STDOUT).to receive(:puts).with(110)
      missionD148.run
    end

    it 'テスト3' do
      allow(STDIN).to receive(:gets).and_return "50 63\n", "50\n"
      expect(STDOUT).to receive(:puts).with(113)
      missionD148.run
    end
  end
end
