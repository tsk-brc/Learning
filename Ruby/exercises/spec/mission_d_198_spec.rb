require './app/mission_d_198.rb'

describe '日付形式チェック' do
  describe '出力結果のテスト' do
    let(:missionD198) { MissionD198.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "12\n", "31\n"
      expect($stdout).to receive(:puts).with('12/31')
      missionD198.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "100\n", "1\n"
      expect($stdout).to receive(:puts).with('100/1')
      missionD198.run
    end
  end
end
