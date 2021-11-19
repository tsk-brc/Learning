require './app/mission_d_195.rb'

describe '必要量算出チェック' do
  describe '出力結果のテスト' do
    let(:missionD195) { MissionD195.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5\n"
      expect($stdout).to receive(:puts).with(7.5)
      missionD195.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "10\n"
      expect($stdout).to receive(:puts).with(15.0)
      missionD195.run
    end
  end
end
