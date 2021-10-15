require './app/mission_d_193.rb'

describe '電池交換チェック' do
  describe '出力結果のテスト' do
    let(:missionD193) { MissionD193.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3\n", "10\n"
      expect($stdout).to receive(:puts).with(3)
      expect($stdout).to receive(:puts).with(1)
      missionD193.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1\n", "1\n"
      expect($stdout).to receive(:puts).with(1)
      expect($stdout).to receive(:puts).with(0)
      missionD193.run
    end
  end
end
