require './app/mission_d_168.rb'

describe 'アメリカ日付チェック' do
  describe '出力結果のテスト' do
    let(:missionD168) { MissionD168.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "2020\n", "10\n", "31\n"
      expect(STDOUT).to receive(:puts).with('10/31/2020')
      missionD168.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "1999\n", "7\n", "1\n"
      expect(STDOUT).to receive(:puts).with('7/1/1999')
      missionD168.run
    end
  end
end
