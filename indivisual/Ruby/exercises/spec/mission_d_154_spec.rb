require './app/mission_d_154.rb'

describe '人数算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD154) { MissionD154.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "4\n", "3\n"
      expect($stdout).to receive(:puts).with(13)
      missionD154.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3\n", "0\n"
      expect($stdout).to receive(:puts).with(9)
      missionD154.run
    end
  end
end
